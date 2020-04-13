PImage mustache;
PImage friend;
void setup() {
  friend = loadImage("kobebryantface.jpeg");
  size(800,800);
  friend.resize(width,height);
  mustache = loadImage("mustachetransparent.png");
  mustache.resize(350,250);
}

void draw() {
  background(friend);
  image(mustache, mouseX, mouseY);
}
