// Kumpulan Soal TOKI #9

#include <bits/stdc++.h>
using namespace std;

int main(){
	int n;
	cin>>n;
	while(n%2==0)
		n=n/2;
	if(n==1)
		cout<<"ya"<<endl;
	else
		cout<<"bukan"<<endl;
}