interface Calculate
{
    public int Sum(int a, int b);
    public int Diff(int a, int b);
}

public class CalculateImpl implements Calculate{
    public int Sum(int a, int b){
        return a+b;
    }

     public int Diff(int a, int b){
        return a-b;
    }
}