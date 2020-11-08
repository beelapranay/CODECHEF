#include<iostream>
using namespace std;

void maha(){
    int n;
    int w[n];
    int odd,even=0;
    cin>>n;
    for(int i=0;i<=n;i++){
        cin>>w[i];
    }
    for(int i=0;i<=n;i++){
        if(w[i]%2==0){
            even+=1;
        }
        else{
            odd+=1;
        }
    }
    if(even<odd){
        cout<<"NOT READY";
    }
    else{
        cout<<"READY FOR BATTLE";
    }
}

int main(){
    maha();
    return 0;
}
