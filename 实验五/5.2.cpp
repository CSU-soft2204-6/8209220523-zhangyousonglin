#include <iostream>
#include<string>
using namespace std;
class Student
{
private:
	int num;
	string Name;
	char sex;
public:
	void display();
	void set_value(string name, int num, char sex) {
		this->num = num;
		Name = name;
		this->sex = sex;
	}
	Student(string name = "null", int num = 0, char sex = '0') {
		this->num = num;
		Name = name;
		this->sex = sex;
	}
};
void Student::display()
{
	cout << "num£º" << num << endl;
	cout << "name:" << Name << endl;
	cout << "sex£º" << sex << endl;
}
int main()
{
	Student stud;
	Student stud1("tcg", 7, 'm');
	stud.display();
	stud1.display();
	return 0;
}