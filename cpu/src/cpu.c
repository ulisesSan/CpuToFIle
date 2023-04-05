//You can copy the compiled file to your bin path (/usr/bin/) and make it a system executable
//You can compile it with a easy name as mhz xd
#include<stdlib.h>
#include<unistd.h>

void main(){
    int a = 0;
    while(a=1){
        system("cat /proc/cpuinfo | grep 'MHz'");
        sleep(2);
        system("clear");
    }
}
