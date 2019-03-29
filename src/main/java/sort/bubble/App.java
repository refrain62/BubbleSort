package sort.bubble;

public class App
{
  public static void main( String[] args )
  {
    BubbleSort bubbleSort = BubbleSort.getInstance();
    
    // 探索データの定義
    // ※対象データはクイックソートなどで事前に昇順に並んでいる前提
    int[] searchData = { 8, 4, 3, 7, 6, 5, 2, 1 };

    System.out.println("Bubble Sort App Start!");
    
    // 検索データの出力
    outputSearchData(
            searchData
            );
    
    // 探索（とりあえず開始時は全範囲指定）
    bubbleSort.execute(
	                    searchData
	                    );
  }

  /**
   * 検索データの出力
   * @param argSearchData
   * @return
   */
  private static void outputSearchData(
                    int[] argSearchData
                    )
  {
    String strDelimiter = "";
    
    System.out.print("Array Data is [");

    strDelimiter = "";
    
    for( int val : argSearchData )
    {
      System.out.print( strDelimiter + val );
      
      strDelimiter = ", ";
    }
    
    System.out.println("]");
  }
}
