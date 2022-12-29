#include<iostream>
using namespace std;
template<class TYPE>
class ListNode {
private:
	TYPE data;
	ListNode* next;
	static ListNode* CurNode;
	static ListNode* head;
public:
	ListNode() {
		next = NULL;
		head = CurNode = this;
	}
	ListNode(TYPE Newdata) {
		data = Newdata;
		next = NULL;
	}
	void AppendNode(TYPE NewNode);
	void DispList();
	void DelList();

};
template<class TYPE>
ListNode < TYPE>* ListNode<TYPE>::CurNode;
template<class TYPE>
ListNode < TYPE>* ListNode<TYPE>::head;
template<class TYPE>
void ListNode<TYPE>::AppendNode(TYPE NewData) {
	CurNode->next = new ListNode(NewData);
	CurNode = CurNode->next;
};
template<class TYPE>
void ListNode<TYPE>::DispList() {
	CurNode = head->next;
	while (CurNode != NULL) {
		cout << CurNode->data << endl;
		CurNode = CurNode->next;
	}
}
template<class TYPE>
void ListNode<TYPE>::DelList() {
	ListNode* q;
	CurNode = head->next;
	while (CurNode != NULL) {
		q = CurNode->next;
		delete CurNode;
		CurNode = q;
	}
	head->next = NULL;
}

int main()
{
	ListNode<char>Clist;
	Clist.AppendNode('A');
	Clist.AppendNode('B');
	Clist.AppendNode('C	');
	Clist.DispList();
	Clist.DelList();
	Clist.DispList();
	return 0;
}