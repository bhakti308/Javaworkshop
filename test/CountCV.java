public class CountCV
{
    public static void main(String args[])
    {
        
    CountCV obj=new CountCV ();
    String str="ones";
    obj.count(str);
}
 
void count (String str)
{
  int cons=0;
  int vow=0;
  char[] strl=str.toCharArray();
  for (int i=0;i<strl.length;i++)
{
  if (strl[i]=='a'||strl[i]=='e'||strl[i]=='i'||strl[i]=='o'||strl[i]=='u')
{
  vow++;

}
else
{
   cons++;

}

}
System.out.println("Number of Vowels="+vow+"\nNumber of consonants="+cons);
}
}