package manager;

import models.ResponseCode;

public class ResponseManager {
	public static String response(String result, int code) {
		ResponseCode response = new ResponseCode();
		response.result = result;
		response.result = result;
		return response.toString();
	}
}
