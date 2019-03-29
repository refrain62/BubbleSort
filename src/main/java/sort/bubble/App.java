package sort.bubble;

public class App
{
  public static void main( String[] args )
  {
    BubbleSort bubbleSort = BubbleSort.getInstance();
    
    // ソートデータの定義
    int[] searchData = { 8, 4, 3, 7, 6, 5, 2, 1 };
    int[] searchData2 = { 8, 4, 3, 7, 6, 5, 2, 1 };

    System.out.println("Bubble Sort App Start!");
    
    // ソートデータの出力
    outputSearchData(
            searchData
            );
    
    // ソート（forループ版）
    bubbleSort.execute(
	                    searchData
	                    );
    
    // ソートデータの出力
    outputSearchData(
            searchData2
            );
    
    // ソート（steam版）
    bubbleSort.executeSteam(
                        searchData2
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
