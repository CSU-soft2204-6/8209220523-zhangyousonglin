#include <iostream>
using namespace std;
class changfangti {
private:
	int height;
	int length;
	int width;
public:
	void set_value() {
		cin >> height >> length >> width;
	}
	void display() {
		cout << height * length * width << endl;;
	}
};
int main()
{
	cout << "第一个长方体长宽高：";
	changfangti t1;
	t1.set_value();
	cout << "第二个长方体长宽高：";
	changfangti t2;
	t2.set_value();
	cout << "第三个长方体长宽高：";
	changfangti t3;
	t3.set_value();
	cout << "第一个长方体体积为：";
	t1.display();
	cout << "第二个长方体体积为：";
	t2.display();
	cout << "第三个长方体体积为：";
	t3.display();
}
