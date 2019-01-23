void setup(){
size (200,200);
}
void draw(){
 int x =150;
  noFill();
  for(int i =15; i>0; i--){
    ellipse(100,100,(10 * i),(10 * i)); 
 if(i%2==0){
 fill (255,3,3);
ellipse (100,100,x,x);
 }
 
 else{
 fill(3,0,0);
 ellipse (100,100,x,x);
 }
 x-=10;
 }
  }
  