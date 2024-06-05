//check WalkerDemo for movement stuffs
class Snake {
    int x, y;
    int size;
    int speed;
    int applesEaten;


    void move(int dir) {
    // Dir is a state variable representing direction/movement from keyPressed
    if (dir == 0) {
      // 0,0, is top left, all Y values are positive going downwards
      y = y - speed;
    }
    else if (dir == 1) {
      x = x + speed;
    }
    else if (dir == 2) {
      y = y + speed;
    }
    else if (dir == 3) {
      x = x - speed;
    }
  }
}