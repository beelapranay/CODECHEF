#include <iostream>
using namespace std;

int main() {
	int t;
	int num;
	int rev;
	cin>>t;
	while(t--){
	    cin>>num;
	}
    while(num>0){ 
        rev=rev*10 + num%10; 
        num = num/10; 
    } 
    if(num==rev){
        cout<<"wins";
    }
    else{
        cout<<"loses";
    }
    return 0;
}