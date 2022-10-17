package backend;

import entity.Document;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LibraryManagement {
    private List<Document> listDocuments;
    private Scanner scanner;

    public LibraryManagement() {
        listDocuments = new ArrayList<>();
        scanner = new Scanner(System.in);
    }

    private void displayMenu(){
        System.out.println("1 - Thêm mới tài liệu");
        System.out.println("2 - Xóa tài liệu theo mã");
        System.out.println("3 - Hiển thị thông tin tài liệu");
        System.out.println("4 - Tìm kiếm tài liệu");
        System.out.println("5 - Thoát chương trình !");
    }

    public void runProgram(){
        while (true){
            displayMenu();
            int choose = scanner.nextInt();
            switch (choose){
                case 1:
                    // thêm mới tài liệu
                    insertDocument();
                    break;
                case 2:
                    // xóa tài liệu
                    removeDocument();
                    break;
                case 3:
                    // Hiển thị thông tin tài liệu
                    viewListDocument();
                    break;
                case 4:
                    // tìm kiếm tài liệu
                    searchDocument();
                    break;
                case 5:
                    System.out.println("Bye Bye !");
                    return;
                default:
                    System.out.println("Vui lòng chọn từ 1 -> 5");
                    break;
            }
        }
    }

    private void insertDocument(){
        System.out.println("Bạn muốn nhập tài liệu loại nào ?");
        System.out.println("|   1 - Sách   |   2 - Tạp chí   |   3 - Báo   |");
        int choose = scanner.nextInt();
        switch (choose){
            case 1:
                // gọi hàm insert Sách:
                insertBook();
                break;
            case 2:
                // gọi hàm insert Tạp chí
                insertMegazine();
                break;
            case 3:
                // gọi hàm insert báo
                insertNewsPaper();
                break;
            default:
                System.out.println("Vui lòng chỉ chọn từ 1 -> 3");
        }
    }

    // Hàm dùng để insert sách
    private void insertBook(){
    }

    // Hàm dùng để insert tạp chí
    private void insertMegazine(){
    }

    // Hàm dùng để insert báo
    private void insertNewsPaper(){
    }

    // Hàm dùng để xóa tài liệu:
    private void removeDocument(){
        //Sử dụng vòng lặp để tìm index của tài liệu cần được remove, sau đó gọi hàm remove của ArrayList để xóa
    }

    // Hàm dùng để in ra danh sách document (nhớ sử dụng đa hình)
    private void viewListDocument() {
    }

    // Hàm dùng để tìm kiếm tài liệu
    private void searchDocument(){
        // Người dùng sẽ nhập mã tài liệu, và hệ thống trả ra (in) màn hình tài liệu tương ứng.
        // gợi ý, sử dụng lòng lặp để tìm
    }
}
