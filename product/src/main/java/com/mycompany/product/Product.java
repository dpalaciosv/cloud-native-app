package com.mycompany.product;


public class Product {
  private int id = 1;
  private String name = "Oranges";
  private int catId = 2;

  public Product (int id){
    this.id = id;
  }

  public Product(){

  }

  public int getId(){
    return this.id;
  }

  public String getName(){
    return this.name;
  }

  public int getCatId(){
    return this.catId;
  }

  public void setId(int id){
    this.id = id;
  }

  public void setName(String name){
    this.name = name;
  }

  public void setCatId(int catId){
    this.catId = catId;
  }

}
