#include<iostream>
#include<cmath>
using namespace std;
const double PI = acos(-1.0);
class Complex {
private:
	double real;
	double image;
public:
	Complex(double real = 1, double image = 0) {
		this->real = real;
		this->image = image;
	}
	void display() {
		cout << real << "." << image << endl;
	}
};
class Pcomplex {
private:
	Complex* pc;
public:
	Pcomplex(Complex* pc = NULL) {
		this->pc = pc;
	}
	Complex* operator ->() {
		static Complex nullPcomplex(0, 0);
		if (pc == NULL) {
			return &nullPcomplex;
		}
		else return pc;
	}
	void display() {
		cout << pc << endl;
	}
};
class Point {
private:
	double x, y;
public:
	Point(double x = 0, double y = 0) {
		this->x = x;
		this->y = y;
		cout << "Point is constructed" << endl;
	}
	virtual ~Point() {
		cout << "Point is destructed" << endl;
	}
	virtual	double area() = 0 {
		return 0;
	}
	virtual void show() {
		cout << "area= " << area() << endl;
	}
};
class Circle : public Point {
private:
	double r;
public:
	Circle(double x, double y, double r = 1) :Point(x, y) {
		this->r = r;
		cout << "Circle is constructed" << endl;
	}
	~Circle() {
		cout << "Circle is destructed" << endl;
	}
	double area() {
		return PI * r * r;
	}

};
class Cylinder :public Circle {
private:
	double h;
public:
	Cylinder(double x, double y, double r, double h) :Circle(x, y, r) {
		this->h = h;
		cout << "Cylinder is constructed" << endl;
	}
	~Cylinder() {
		cout << "Cylinder is destructed" << endl;
	}
	double area() {
		return h * Circle::area();
	}
};

int main()
{
	Complex a1;
	Pcomplex b1 = &a1;
	b1.display();
	b1->display();
	Pcomplex b2;
	b2->display();
	Circle c1(10, 10, 20);
	c1.show();
	Point* Pp = &c1;
	Pp->show();
	Cylinder d1(10, 2, 3, 4);
	d1.show();
	Point* c2 = new Circle(2, 2, 2);
	c2->show();
	delete c2;
	Point* d3 = new Cylinder(2, 3, 4, 5);
	d3->show();
	delete d3;
	return 0;
}