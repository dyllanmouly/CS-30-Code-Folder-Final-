//check WalkerDemo for movement stuffs
class Snake {
    int x, y;
    int d, dx, dy;
    int size;
    int speed;

    Snake(int tempx, int tempy) {
        x = tempx;
        y = tempy;
        size = 25;
        speed = 20; 
    }

    void display() {
        fill(0);
        rect(x,y,size,size);
    }

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
    void move() {
    //Apply the rate of change (velocity/speed)
    x = x + dx;
    y = y + dy;

    //reverse directions
    if (x <= d/2 || x >= width - d/2) {
        dx = dx* -1;
    }

    if (y <= d/2 || y >= height - d/2) {
        dy = dy * -1;
    }
    }
}