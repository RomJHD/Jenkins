import spark.servlet.SparkApplication;

import static spark.Spark.get;

public class HelloWorld implements SparkApplication {
	public static void main(String[] args) {
		new HelloWorld().init();
	}

	@Override
	public void init() {
		get("/hello", (req, res) -> "Hello Mina");
		get("/maison", (req, res) -> "Hello c'est la maisonj");
		get("/yop", (req, rest) -> "Hello t'es sur SALUT");
		get("/loup", (req, rest) -> "Yop loup t'es sur mon docker");
	}
	
}
