//Logic-2 > luckySum 

//Given 3 int values, a b c, return their sum. However, if one of the values is 13 then it does not count towards the sum and values to its right do not count. So for example, if b is 13, then both b and c do not count.

public int luckySum(int a, int b, int c) {
  a = check13(a);
  b = check13(b);
  c = check13(c);
  if (a == 0){
    b = 0;
  }
  if (b == 0){
    c = 0;
  }
  return a + b + c;
  
}

public int check13(int n){
  if (n==13){
    return 0;
  }
  return n;
}
