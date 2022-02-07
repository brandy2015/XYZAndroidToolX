
import android.app.Activity
import android.content.Context
import android.content.Intent
import androidx.fragment.app.Fragment


var XYZVCXA = XYZVCXAobject()

class XYZVCXAobject(){
    companion object {
        const val INTENT_LIST_KEY = "list"
        const val LIST_DETAIL_REQUEST_CODE = 123
        const val PresentQR_DETAIL_REQUEST_CODE = 888
        const val firstChat_REQUEST_CODE = 234
    }
    //        val listDetailIntent = Intent(contextX, TVC::class.java)
//        listDetailIntent.putExtra(FinderFragment.INTENT_LIST_KEY, list)
//        startActivityForResult(listDetailIntent, FinderFragment.LIST_DETAIL_REQUEST_CODE)
    fun PresentVCActivity(Activityx: Activity, context: Context, TVC: Activity){
        val listDetailIntent = Intent(context, TVC::class.java)
//        //FinderFragment.INTENT_LIST_KEY
//        listDetailIntent.putExtra(listToPassKey, listToPass)
//        FinderFragment.LIST_DETAIL_REQUEST_CODE
        Activityx.startActivity(listDetailIntent)
//        startActivityForResult(listDetailIntent,backKey)
    }

    fun PresentActivityxVC(Activityx: Activity, context: Context, TVC: Activity, listToPass:String, listToPassKey:String, backKey:Int){
        val listDetailIntent = Intent(context, TVC::class.java)
        //FinderFragment.INTENT_LIST_KEY
        listDetailIntent.putExtra(listToPassKey, listToPass)
//        FinderFragment.LIST_DETAIL_REQUEST_CODE
        Activityx.startActivityForResult(listDetailIntent,backKey)
//        startActivityForResult(listDetailIntent,backKey)
    }

    fun PresentVCFragmentXx(FragmentX: Fragment, context: Context, TVC: Activity){
        val listDetailIntent = Intent(context, TVC::class.java)
//        //FinderFragment.INTENT_LIST_KEY
//        listDetailIntent.putExtra(listToPassKey, listToPass)
//        FinderFragment.LIST_DETAIL_REQUEST_CODE
        FragmentX.startActivity(listDetailIntent)
//        startActivityForResult(listDetailIntent,backKey)
    }

    //        XYZVCXA.PresentVC(this,contextX,TVC,list,FinderFragment.INTENT_LIST_KEY,FinderFragment.LIST_DETAIL_REQUEST_CODE)
    //        val listDetailIntent = Intent(context, TVC::class.java)
    //        listDetailIntent.putExtra(FinderFragment.INTENT_LIST_KEY, list)
    //        startActivityForResult(listDetailIntent, FinderFragment.LIST_DETAIL_REQUEST_CODE)
    fun PresentVCFragmentX(FragmentX: Fragment, context: Context, TVC: Activity, listToPass:String, listToPassKey:String, backKey:Int){
        val listDetailIntent = Intent(context, TVC::class.java)
        //FinderFragment.INTENT_LIST_KEY
        listDetailIntent.putExtra(listToPassKey, listToPass)
//        FinderFragment.LIST_DETAIL_REQUEST_CODE
        FragmentX.startActivityForResult(listDetailIntent,backKey)
//        startActivityForResult(listDetailIntent,backKey)
    }
//返回值
//    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
//        super.onActivityResult(requestCode, resultCode, data)
//        // 1
//        if (requestCode == LIST_DETAIL_REQUEST_CODE && resultCode == Activity.RESULT_OK) {
//            // 2
//            data?.let {
//                // 3
////                listDataManager.saveList(data.getParcelableExtra(INTENT_LIST_KEY) as TaskList)
////                updateLists()
//            }
//        }
//    }

}


