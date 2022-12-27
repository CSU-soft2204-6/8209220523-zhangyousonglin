#include<iostream>
#include<map>
#include<queue>
#include<vector>
using namespace std;

int main()
{
	queue<double>scorequeue;
	vector<double>scorevector;
	map<int, double> score_map;
	score_map.emplace(3, 90.0);
	cout << "学号为3的成绩" << score_map[3] << endl;
	scorequeue.push(3.0);
	scorevector.push_back(3.0);
	int size_1;
	cin >> size_1;
	for (int i = 0; i < size_1; i++) {
		double t;
		cin >> t;
		scorevector.push_back(t);
		cout << "容器大小" << scorevector.size() << endl;
		cout << "容器容量" << scorevector.capacity() << endl;
	}
	for (int i = 0; i < scorevector.size(); i++) {
		cout << "元素" << i << "的值为:" << scorevector[i] << endl;
	}
	int i = 0;
	vector<double>::iterator vector_it;
	for (vector_it = scorevector.begin(); vector_it != scorevector.end(); vector_it++) {
		cout << "元素" << ++i << "的值为:" << *vector_it << endl;

	}
	while (!scorevector.empty()) {
		double t = scorevector.back();
		scorevector.pop_back();
		cout << "弹出" << t << endl;
	}
	cout << "容器大小" << scorevector.size() << endl;
	cout << "容器容量" << scorevector.capacity() << endl;
	return 0;
}