package models;

import com.google.gson.Gson;

public class ResponseCode {
	public String result,code;
	public String toString(){
        return new Gson().toJson(this);
    }
}
