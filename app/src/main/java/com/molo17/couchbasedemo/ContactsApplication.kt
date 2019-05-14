package com.molo17.couchbasedemo

import android.app.Application

/**
 * Created by Matteo Sist on 01/03/2019.
 */
class ContactsApplication : Application() {

    private var replicatorManager: ReplicatorManager? = null

    override fun onCreate() {
        super.onCreate()

        /// STEP 46
        /// Check if url string is valid and init replicationManager.
//        replicatorManager = runCatching { URI(remoteDatabaseURL) }.getOrNull()
//            ?.takeIf { it.toString().isNotEmpty() }
//            ?.let { ReplicatorManager(this, it) }

            /// STEP 47
            /// Start replication when app enter in foreground.
            /// Stop replication when app enter in background.
//            ?.also(ProcessLifecycleOwner.get().lifecycle::addObserver)
    }


}