package com.project.android.viewassets

import java.util.ArrayList


data class ViewAssetItem (val ivySerial: String, val assetCategory: String, val assetType : String, val status : String )

object Supplier{

    val data = listOf<ViewAssetItem>(
        ViewAssetItem("IVY6733","Hardware","mobile","assigned"),
        ViewAssetItem("IVY6757", "Software","Operating System","assigned"),
        ViewAssetItem("IVY76749", "Networking", "Printer","Not assigned"))

}





