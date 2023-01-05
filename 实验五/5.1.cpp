#include<iostream>
using namespace std;
class Time
{
private:
	int hour;
	int minute;
	int sec;
public:
	void shuru() {
		cin >> hour >> minute >> sec;
	}
	void display() {
		cout << hour << ":" << minute << ":" << sec << endl;
	}
};
int main()
{
	Time t1;//¶¨Òåt1
	t1.shuru();
	t1.display();
	return 0;
}