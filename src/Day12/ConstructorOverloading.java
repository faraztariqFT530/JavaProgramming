package Day12;

public class ConstructorOverloading {
    double height, width, depth;
    ConstructorOverloading(){  //1
        height=depth=width=0;
    }
    ConstructorOverloading(double w, double h, double d){   //2
        height=h;
        depth=d;
        width=w;
    }
    ConstructorOverloading (double len){   //3
        height=depth=width=len;
    }

    double volume(){
        return (height*width*depth);
    }
}
