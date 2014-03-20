def power1( x:Int,y:Int):Double = {
 if (y==0) 1 else 
	if (y>0) x*power1(x,(y-1)) 
		else 1/power1(x,-y)
}