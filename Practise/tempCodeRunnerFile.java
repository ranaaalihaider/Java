        double x1=39.55;
        double x2=41.5;
        double y1=-116.25;
        double y2=87.37;
        double radius=6371000.01;
        double d=radius * Math.cos(((Math.sin(x1))*(Math.sin(x2)))+((Math.cos(x1))*(Math.cos(x2))*(Math.cos(y1-y2))));
        System.out.println(d);
        