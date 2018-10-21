package first;

public class Box {
    int length ;
    int width;
    int height;

    int area;

    public Box(){
        this.width=9;
        this.length=9;
        this.height=9;
    }


    public Box(int length, int width, int height){
        this.height=height;
        this.length=length;
        this.width=width;
    }

    //================================

    public Box(int one ){
        this.width=this.length=this.height=one;

    }
    //=================================
    public int findArea(){

        return 2*(this.width*this.length+this.length*this.height+this.width*this.height);
    }

    public int findVolume(){
            return this.height*this.width*this.length;

    }


}
