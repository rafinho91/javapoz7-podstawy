package oop.shape;

public class ShapesApplication {
    public static void main(String[] args) {
//        Square square = new Square(4);
//        Square square2 = new Square(8);
//        Square square3 = new Square(2);
        Square[] squares = {new Square(4), new Square(8), new Square(2)};
//        Square[] squares = {square, square2, square3};
        Rectangle[] rectangles = {new Rectangle(2, 4), new Rectangle(3,6), new Rectangle(7, 2)};
//        showSquares(squares);

        Shape[] shapes = {new Square(4), new Rectangle(3,2), new Diamond()};
        showShapes(shapes);
        showShapes(squares);
        showShapes(rectangles);

    }

    private static void showShapes (Shape[] shapes) {
        for (int i = 0; i < shapes.length; i++) {
            System.out.println("Field: " + shapes[i].field());
            System.out.println("Circuit: " + shapes[i].circuit());
            System.out.println("Diagonal: " + shapes[i].diagonal());
        }
    }

//    private static void showRectangles(Rectangle[] rectangles) {
//        for (int i = 0; i < rectangles.length; i++) {
//            showRectangle(rectangles[i]);
//        }
//    }
//
//    private static void showRectangle(Rectangle rectangle) {
//        System.out.println("Field: " + rectangle.field());
//        System.out.println("Circuit: " + rectangle.circuit());
//        System.out.println("Diagonal: " + rectangle.diagonal());
//    }
//
//    private static void showSquares(Square[] squares) {
//        for (int i = 0; i < squares.length; i++) {
//            showSquare(squares[i]);
//        }
//    }
//
//    private static void showSquare(Square square) {
//        System.out.println("Field: " + square.field());
//        System.out.println("Circuit: " + square.circuit());
//        System.out.println("Diagonal: " + square.diagonal());
//    }
}
