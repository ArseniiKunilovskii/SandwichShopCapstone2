package com.pluralsight.userInterface;

import com.pluralsight.items.Item;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class ReceiptFileManager {
    public void saveReceipt(Order order, String paymentType,double tax) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMdd-hhmmss");
        LocalDateTime now = LocalDateTime.now();
        ArrayList<Item> items = order.getItems();
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(now.format(formatter)+".txt"))) {
            bw.write("Receipt #" );
            for (int i = 0; i < items.size();i++){
                if (items.get(i)!=null) {
                    try {
                        bw.write(items.get(i).toString());
                        bw.newLine();
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
            bw.write("Total: " + order.getTotal());
            bw.newLine();
            bw.write("Tax: " + tax);
            bw.newLine();
            bw.write("Payment type: " + paymentType);
            bw.newLine();
            bw.write("Time: " + LocalTime.now());
            bw.newLine();
            bw.write("Signature: ");
            bw.newLine();
            bw.write("------------------------------------------");


            System.out.println("Receipt saved successfully to " + now.format(formatter)+ ".txt.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
