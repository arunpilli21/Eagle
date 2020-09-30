/*
 *                "Copyright 2020 Infosys Ltd.
 *                Use of this source code is governed by GPL v3 license that can be found in the LICENSE file or at https://opensource.org/licenses/GPL-3.0
 *                This program is free software: you can redistribute it and/or modify it under the terms of the GNU General Public License version 3"
 *
 */

package com.infosys.hubservices.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public class Response implements Serializable, Cloneable {

	private static final long serialVersionUID = -3773253896160786443L;

/*	@JsonIgnore
	public static final String SUCCESSFUL = "SUCCESSFUL";
	@JsonIgnore
	public static final String FAILED = "FAILED";
	@JsonIgnore
	public static final String MESSAGE = "message";
	@JsonIgnore
	public static final String DATA = "data";
	@JsonIgnore
	public static final String STATUS = "status";*/


	private Map<String, Object> result = new HashMap<>();

	public Map<String, Object> getResult() {
		return result;
	}

	public Object get(String key) {
		return result.get(key);
	}

	public void put(String key, Object vo) {
		result.put(key, vo);
	}

	public void putAll(Map<String, Object> map) {
		result.putAll(map);
	}

	public boolean containsKey(String key) {
		return result.containsKey(key);
	}

	public Response clone(Response response) {
		try {
			return (Response) response.clone();
		} catch (CloneNotSupportedException e) {
			return null;
		}
	}
}
