package com.thomas.customvollydemo;

import java.util.HashMap;

import android.os.Bundle;

import com.google.gson.JsonObject;

public class MainActivity extends BaseActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		loginAction();
	}

	@Override
	public void onRecvData(JsonObject response) {
		// TODO Auto-generated method stub

	}

	private void loginAction() {
		HashMap<String, String> params = new HashMap<String, String>();
		params.put("email", "zengwentao@aikong.net");
		params.put("password", "123456");
		request("application/login", params, FLAG_SHOW_PROGRESS | FLAG_SHOW_ERROR
				| FLAG_CANCEL);
	}
}
