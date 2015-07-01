package controllers;

import java.util.Date;
import java.util.List;

import models.FlashAdWrapper;
import models.MessageWrapper;
import models.User;
import play.mvc.Controller;

public class Application extends Controller {

	public static void index() {
		render();
	}

	public static void allUser() {
		List<User> users = User.find("order by id desc").fetch();
		renderJSON(users.toString());
	}

	public static void addUser() {
		User users = new User("huanghongda@outlook.com", "12345678");
		users.save();
		renderJSON(users.toString());
	}

	public static void addAd() {
		FlashAdWrapper ad = new FlashAdWrapper("ADIDAS",
				"http://192.168.10.45:9000/public/assets/images.jpg",
				new Date());
		ad.save();
		renderJSON(ad.toString());
	}

	public static void addMessage() {
		MessageWrapper message = new MessageWrapper(
				"如果青蛙变成了网站，如果公主没有醒来，如果小人鱼没有化作泡沫，我还会相信爱情吗？相信，因为还有你在我身边，茫茫人海，凭你的名字导航，凄凄寒夜，握你的名字取暖，漫漫人生，携你的名字同游。",
				1, new Date());
		message.save();
		renderJSON(message.toString());
	}

	public static void getAd(String timeStamp) {
		List<FlashAdWrapper> ads = FlashAdWrapper.find("order by id desc")
				.fetch();
		renderJSON(ads.toString() + "|" + timeStamp);
	}

	public static void getMessage(int msgType, String timeStamp, String pagesize) {
		List<MessageWrapper> messages = MessageWrapper.find("type", msgType)
				.fetch();
		renderJSON(messages.toString());
	}

	public static void login(String email, String password) {
		User users = new User(email, password);
		users.save();
		renderJSON(users.toString());
	}

}