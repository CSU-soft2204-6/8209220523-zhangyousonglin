package com.yrd980.TankWar4;

import java.io.*;
import java.util.Vector;

/**
 * @author Yrd
 * @version 1.0
 * 定义该类是为了记录所以采用IO流
 */
@SuppressWarnings({"all"})
public class Recorder_ {
	private static int allEnermyTankNums = 0;

	//准备io流
	//准备写数据到文件中
	private static FileWriter fw = null;
	private static BufferedWriter bw = null;
	private static BufferedReader br = null;
	private static String recordFile = "d:\\myRecord.txt";

	//定义vector来指向已有的敌人坦克数组
	//体现类与类之间的封装关系
	private static Vector<EnemyTank> enemyTanks = null;

	private static Vector<Node> nodes = new Vector<>();

	public static void setEnemyTank(Vector<EnemyTank> enemyTanks) {
		Recorder_.enemyTanks = enemyTanks;
	}

	public static int getAllEnermyTankNums() {
		return allEnermyTankNums;
	}

	public static void setAllEnermyTankNums(int allEnermyTankNums) {
		Recorder_.allEnermyTankNums = allEnermyTankNums;
	}

	//我方击毁后记录增加
	public static void addRecordEnermyNum() {
		allEnermyTankNums++;
	}

	//增加一个方法用于恢复文件信息
	public static Vector<Node> getNodesAndEnermyNum() {

		try {
			br = new BufferedReader(new FileReader(recordFile));

			allEnermyTankNums = Integer.parseInt(br.readLine());
			//开始循环读取
			String line = "";
			while ((line = br.readLine()) != null) {
				String[] str = line.split(" ");
				Node node = new Node(Integer.parseInt(str[0]), Integer.parseInt(str[1]), Integer.parseInt(str[2]));
				nodes.add(node);
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (br != null) {
				try {
					br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		return nodes;
	}

	//增加一个方法当程序退出时就保存数据
	//同时保存敌人的数据
	public static void keepRecord() {

		try {
			bw = new BufferedWriter(new FileWriter(recordFile));
			bw.write(allEnermyTankNums + "\r\n");
			//使用newline方法会乱码
			//bw.newLine();
			for (int i = 0; i < enemyTanks.size(); i++) {
				EnemyTank enemyTank = enemyTanks.get(i);
				if (enemyTank.isLive) {//建议判断提前移除了
					String record = enemyTank.getX() + " " + enemyTank.getY() + " " + enemyTank.getDirection();
					bw.write(record + "\r\n");
				}
			}

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (bw != null) {
				try {
					bw.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
