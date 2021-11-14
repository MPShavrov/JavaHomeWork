package com.pb.shavrov.hw7;

public class Atelier {
    public static void main(String[] args) {

        Tshirt tshirt = new Tshirt("Белый", SizeC.M, 300);
        Pants pants = new Pants("Черный", SizeC.XXS, 500);
        Skirt skirt = new Skirt("Розовый", SizeC.L, 600);
        Tie tie = new Tie("Красный", SizeC.S, 200);


        Clothes clothes[] = {tshirt, pants, skirt, tie};

        dressMan(clothes);
        dressWomen(clothes);
//******************************************************************************
        SizeC[] sizes = SizeC.values();
        System.out.println("Все размеры одежды: ");
        for (SizeC sizeC : sizes) {
            System.out.println(sizeC);
        }

        System.out.println(SizeC.XXS.getEuroSize());
        System.out.println(SizeC.XXS.getDescription());
    }

    public static void dressMan(Clothes[] clothes) {
        System.out.println("Мужская одежда: ");
        for (Clothes clothe : clothes) {
            if (clothe instanceof ManClothes) {
                System.out.println(clothe);
            }
        }
    }

    public static void dressWomen(Clothes[] clothes) {
        System.out.println("Женская одежда: ");
        for (Clothes clothe : clothes) {
            if (clothe instanceof WomenClothes) {
                System.out.println(clothe);
            }
        }
    }
}
