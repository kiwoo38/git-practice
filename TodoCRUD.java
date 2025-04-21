package org.example.J071;

import java.util.ArrayList;
import java.util.Scanner;

public class TodoCRUD implements iCRUD {
        private ArrayList<TodoItem>list;

    public TodoCRUD(ArrayList<TodoItem>list) {
        this.list=list;
    }

    @Override
    public int addItem() {
        String title, desc;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter title: ");
        return 0;
    }

    @Override
    public int updateItem(String title) {
        return 0;
    }

    @Override
    public int deleteItem(String title) {
        return 0;
    }

    @Override
    public int printALl() {
        return 0;
    }
}
