int x1 = 100;
int x2 = 300;
void setup(){
size (800,400);
}
void draw(){
  background(#A5A5A5);
  noFill();
  for(int i =0; i<15; i++){
    ellipse(x1,100,(10 * i),(10 * i)); 
 noFill();
    ellipse(x2,100,(10 * i),(10 * i)); 
  }
x1++;
x2--;
  
}





  
  