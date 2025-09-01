package com.example.demo;

import com.example.demo.UserMapper.articleMapper;
import com.example.demo.UserMapper.commentMapper;
import com.example.demo.UserMapper.userMapper;
import com.example.demo.pojo.*;
import org.apache.logging.log4j.util.Chars;
import org.junit.jupiter.api.DisplayNameGenerator;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileAttribute;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.stream.Stream;

@SpringBootTest
class DemoApplicationTests {

	@Autowired
	private userMapper userMapper;

	@Autowired
	private articleMapper articleMapper;

	@Autowired
	private commentMapper commentMapper;

//	@Test
//	void contextLoads() {
//		User user = new User();
//		user.setId(7);
//		user.setUsername("刘备");
//		user.setPassword("A0116659");
//		user.setAge(56);
//		user.setCreated(new Date());
//
//		int num = userMapper.insertUser(user);
//		System.out.println(num==0?"失败":"成功！");
//		插入文章
//		Article article = new Article();
//		article.setId(4);
//		article.setContent("喜羊羊与灰太狼");
//		article.setTimestamp(new Date());
//		article.setUserId(2);
//		int result = articleMapper.insertArticle(article);
//		System.out.println(result==0?"失败":"成功");

		//删除文章
//		int num = articleMapper.deleteArticle(1);
//		System.out.println(num==0?"失败":"删除成功");

		//修改文章
//		Article article = new Article();
//		article.setContent("再次测试");
//		article.setId(1);
//		article.setUserId(2);
//		article.setTimestamp(new Date());
//		int num = articleMapper.updateArticleById(article);
//		System.out.println(num==0?"失败":"修改成功");

		//以id挑选文章
//		Article article = articleMapper.selectVyId(2);
//		System.out.println(article);

		//挑选全部
//		Article[] articles = articleMapper.selectAllArticle();
//		Arrays.stream(articles).forEach(System.out::println);

//}
//	@Test
//	public void testDemo01() {
//		articleVO1 article = articleMapper.selectArticleById(2);
//		System.out.println(article);
//	}
//
//	@Test
//	void testDemo02() {
//		articleVO1[] articleVO1s =
//				articleMapper.selectArticleByIdV2();
//		Arrays.stream(articleVO1s).forEach(System.out::println);
//	}

//	@Test
//	void insertCommentTest(){
//		comment comment = new comment();
//		comment.setId(5);
//		comment.setArticleId(2);
//		comment.setContent("这是第五条评论");
//		comment.setTimeStamp(new Date());
//		comment.setUserId(2);
//		int num = commentMapper.insertComment(comment);
//		System.out.println(num==0?"插入失败":"插入成功");
//	}
//
//	@Test
//	void deleteComment(){
//		int num = commentMapper.deleteByID(5);
//		System.out.println(num==0?"删除失败":"删除成功");
//	}

//	@Test
//	void updateComment() {
//		comment comment = commentMapper.selectById(2);
//		comment.setContent("修改第二条评论！");
//		int num = commentMapper.updateById(comment);
//		System.out.println(num==0?"失败":"成功");
//	}

//	@Test
//	void testDemo05() {
//		commentVO1 articleVO1 =
//				commentMapper.selectCommentById1(3);
//		System.out.println(articleVO1);
//	}

//	@Test
//	void testDemo() {
//		commentVO02[] commentVO02 =
//				commentMapper.selectCommentById2(1);
//		Arrays.stream(commentVO02).forEach(System.out::println);
//	}

//	@Test
//	void testDemo02() {
//		comment comment = commentMapper.selectById(3);
//		System.out.println(comment);
//	}

	//删除语句
//	@Test
//	void deleteUser() {
//		int num = userMapper.deleteUser(5);
//		System.out.println(num==0?"删除失败":"删除成功");
//	}

	//测试输入输出流
//	@Test
//	void test() throws FileNotFoundException {
//		File file = new File(".//A.txt");
//		try(InputStreamReader inputStreamReader = new InputStreamReader(
//				new FileInputStream(file)
//		))
//		{
//			long length = file.length();
//			System.out.println(length);
//			char[] chars = new char[(int)length];
//			int num = inputStreamReader.read(chars);
//			System.out.println();
//		}catch (Exception e){
//			e.printStackTrace();
//		}
//    }

//	@Test
//	void test() {
//		File file = new File(".//A.txt");
//		try(PrintWriter printWriter = new PrintWriter(
//				new BufferedWriter(new OutputStreamWriter(
//						new FileOutputStream(file)
//				))
//		))
//		{
//			printWriter.println("这是一个写入文本的测试");
//			printWriter.
//		}
//		catch (Exception e) {
//			e.printStackTrace();
//		}
//	}

//	@Test
//	void test() {
//		File file = new File(".//test.dat");
//		try( ObjectOutputStream objectOutputStream = new ObjectOutputStream(
//				new BufferedOutputStream(
//						new FileOutputStream(file))
//		))
//		{
//			objectOutputStream.writeObject(new Object());
//		}catch (Exception e) {
//			e.printStackTrace();
//		}
//	}

//	@Test
//	void test() {
//		File file = new File(".//test.dat");
//		try( ObjectInputStream objectInputStream = new ObjectInputStream(
//				new BufferedInputStream(
//						new FileInputStream(file))
//		))
//		{
//			Object o = (Object) objectInputStream.readObject();
//		}catch (Exception e) {
//			e.printStackTrace();
//		}
//	}

//	@Test
//	void test() throws IOException {
//		Path path = Path.of("A.txt");
//		Files.writeString(path,"你妈的逼",StandardCharsets.UTF_8,
//				StandardOpenOption.APPEND);
//		List<String> s  = Files.readAllLines(path);
//		s.forEach(System.out::println);
//		String type = Files.probeContentType(path);
//		System.out.println(type);
//
//	}

//	@Test
//	void dynamicUpdateArticle() {
//		Article article = new Article();
//		article.setUserId(2);
//		article.setId(2);
//		article.setContent("这是修改第二个");
//		article.setTimestamp(new Date());
//		int num = articleMapper.dynamicUpdateArticle(article);
//		System.out.println(num==0?"修改失败":"修改成功");
//
//	}

	//测试
//	@Test
//	void dynamicDeleteArticle() {
//		int num = articleMapper.dynamicDeleteArticle(1,2,3);
//		System.out.println(num==0?"删除失败":"删除成功");
//	}
	//测试动态操作
}
