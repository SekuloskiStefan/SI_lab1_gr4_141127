class Canvas {
    List<Points> points = new List<Points>;

    public void addPoint(int x, int y){
        Point p = new Point(x, y);
        points.add(p);
    }

    public void removePoint(){
        points.remove();
    }
}
