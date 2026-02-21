#include <iostream>
using namespace std;

class Node{
    public:
        int data;
        Node *next;

        Node(int val){
            data = val;
            next = nullptr;
        }
};

void insertAtHead(Node* &head, int val){
    Node *newNode = new Node(val);
    newNode->next = head;
    head = newNode;
}

void insertAtTail(Node* &head, int val){
    Node *newNode = new Node(val);

    if(head == nullptr){
        head = newNode;
        return;
    }

    Node *temp = head;
    while(temp->next != nullptr){
        temp = temp->next;
    }

    temp->next = newNode;
}


void display(Node* head){
    Node *temp = head;
    while(temp!= nullptr){
        cout << temp->data << "->";
        temp = temp->next;
    }
    cout << "nullptr" << endl;
}


void deleteHead(Node* &head){
    if(head == nullptr){
        return;
    }
    Node *temp = head;
    head = head->next;
    delete temp;
}

int main(){
    Node *head = NULL;

    insertAtTail(head, 10);
    insertAtTail(head, 170);
    insertAtTail(head, 180);
    insertAtTail(head, 160);
    insertAtTail(head, 50);
    insertAtTail(head, 190);

    display(head);
}