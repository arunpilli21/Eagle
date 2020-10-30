const express = require("express");
const router = express.Router();

router.get("/badges/:userId/:id", function (req, res) {
  console.log("api service started");
  console.log("user id : userId"); 
  let URL = `http://lex-core:7001/v3/users/${req.params.userId}/badges`;
  let data;
  request(
    {
      headers: {
        "content-type": "application/json",
        rootorg: req.get("rootorg") ? req.get("rootorg") : "igot",
        org: req.get("org") ? req.get("org") : "dopt",
        wid: req.get("wid")
          ? req.get("wid")
          : "9cdd9f76-2584-4ae5-940d-3f51dce020dc",
        //authorization: req.get("authorization"),
      },
      uri: URL,
      method: "POST",
      body: JSON.stringify({
        fetchOneLevel: false,
        fields: ["name", "description", "appIcon"],
        fieldsPassed: true,
        org: "dopt",
        rootOrg: "igot",
        userId: "9cdd9f76-2584-4ae5-940d-3f51dce020dc",
      }),
    },
    function (err, response, body) {
      if (err) {
        console.log("error:", err);
        res.send(err);
      } else {
        console.log("api successful");
        data = JSON.parse(body);
        if (data) {
          var html = `<!DOCTYPE html>
            <html lang="en">
              <head>             
                <meta charset="utf-8" />
                <title>"${data.name}"</title>
                <link id="id-app-fav-icon" rel="icon" type="image/png" href="/image/favicon.png")
                " />
                <meta id="id-social-description" name="description"  content="${
                  data.description
                }">             
                <meta property="og:type" content="website">
                <meta property="og:url" content="${`https://d136953gtttd92.cloudfront.net/share/content/${req.params.id}`}" />
                <meta property="og:title" content="${data.name}" />
                <meta property="og:description" content="${data.description}" />
                <meta property="og:image" content="${data.appIcon}" />  
                <meta property="og:image:secure_url" content="${
                  data.appIcon
                }" />        
            
                <meta property="twitter:card" content="summary_large_image" />
                <meta property="twitter:url" content="${`https://d136953gtttd92.cloudfront.net/share/content/${req.params.id}`}" />
                <meta property="twitter:title" content="${data.name}" />
                <meta property="twitter:description" content="${
                  data.description
                }" />
                <meta property="twitter:image" content="${data.appIcon}" />
                <style>
                  .social-card {
                    box-shadow: 0 0 0 1px rgba(0,0,0,.15), 0 2px 3px rgba(0,0,0,.2);
                    max-width: 300px;
                    margin: 16px;
                    text-align: center;
                    font-family: arial;
                  }
                  
                  .sub-card {
                      padding: 10px;
                    
                  }
                  
                  .title {
                      font-size: 1.2rem;    
                      font-weight: 600;
                      color: rgba(0,0,0,.9);
                  }
                  
                  .desc{
                    font-size: 0.6rem;  
                      font-weight: 600;
                      color: rgba(0,0,0,.9);    
                  }
                  
                  .social-card-img {	
                    width:100%;   
                  }
                  
                  a {
                    text-decoration: none;
                    font-size: 22px;
                    color: black;
                  }                          
                </style>
              </head>
              <body>
                <div class="social-card">
                  <a href="https://d136953gtttd92.cloudfront.net/app/toc/${
                    req.params.id
                  }/overview">
                    <img src="${data.appIcon}" alt="${
            data.name
          }"  class="social-card-img" />
                    <div class="sub-card">
                      <pclass="title">${data.name}</p>
                      <p class="desc">${data.description}</p>
                    </div>  
                  </a>   
                </div>                       
              </body>
            </html>          
              `;
          res.send(html);
        }
      }
    }
  );
});

module.exports = router;