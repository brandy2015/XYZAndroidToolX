
import android.content.Context

var XYZSaveData = SaveDataObject()

class SaveDataObject() {

    lateinit var contextX: Context

    fun saveUserImageList(list: Map<String?, String?>) {
        val sharedPreferences = androidx.preference.PreferenceManager.getDefaultSharedPreferences(contextX).edit()  // 1
        for (i in list.keys) {                                                                                      // 2
            sharedPreferences.putString(i, list.get(i))
        }
        sharedPreferences.apply()                                                                                   // 3
    }

    fun readUserImageLists(): Map<String?, String?>? {
        val sharedPreferences =
                androidx.preference.PreferenceManager.getDefaultSharedPreferences(contextX)
        val sharedPreferenceContents = sharedPreferences.all
        var taskLists: Map<String?, String?>? = mapOf()
        taskLists = sharedPreferenceContents as Map<String?, String?>?
        return taskLists
    }
}