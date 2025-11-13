package com.pluralsight.userInterface;

import com.pluralsight.items.Item;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class ReceiptFileManager {
    public void saveReceipt(Order order, String paymentType,double tax) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMdd-hhmmss");
        LocalDateTime now = LocalDateTime.now();
        ArrayList<Item> items = order.getItems();
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(now.format(formatter)+".txt"))) {
            bw.write("Receipt #" );
            items.forEach(item -> {
                try {
                    bw.write(item.toString());
                    bw.newLine();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            });
            bw.write("Total: " + order.getTotal());

            System.out.println("Receipt saved successfully to " + now.format(formatter)+ ".txt.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
