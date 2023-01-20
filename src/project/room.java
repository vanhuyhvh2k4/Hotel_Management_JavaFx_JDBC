/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project;

/**
 *
 * @author vanhu
 */
public class room {
    private String roomNo;
    private String roomType;
    private String bed;
    private int price;
    private String status;
    
    public room (String roomNo, String roomType, String bed, int price, String status)
    {
        this.roomNo = roomNo;
        this.roomType = roomType;
        this.bed = bed;
        this.price = price;
        this.status = status;
    }
    
    public String getRoomNo()
    {
        return roomNo;
    }
    public String getRoomType()
    {
        return roomType;
    }
    public String getBed()
    {
        return bed;
    }
    public int getPrice()
    {
        return price;
    }
    public String getStatus()
    {
        return status;
    }
}

