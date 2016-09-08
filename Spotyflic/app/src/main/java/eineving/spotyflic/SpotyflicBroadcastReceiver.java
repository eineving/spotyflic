package eineving.spotyflic;

import android.content.Context;

import io.flic.lib.FlicBroadcastReceiver;
import io.flic.lib.FlicButton;
import io.flic.lib.FlicManager;

import com.spotify.sdk.android.player.Spotify;
import com.spotify.sdk.android.player.ConnectionStateCallback;
import com.spotify.sdk.android.player.Player;
import com.spotify.sdk.android.player.PlayerNotificationCallback;
import com.spotify.sdk.android.player.PlayerState;


/**
 * Created by danie on 2016-09-07.
 */
public class SpotyflicBroadcastReceiver extends FlicBroadcastReceiver {
    @Override
    protected void onRequestAppCredentials(Context context) {
        //TODO set these credentials
        FlicManager.setAppCredentials("","","");
    }

    @Override
    public void onButtonSingleOrDoubleClickOrHold(Context context, FlicButton button, boolean wasQueued, int timeDiff, boolean isSingleClick, boolean isDoubleClick, boolean isHold) {
        super.onButtonSingleOrDoubleClickOrHold(context, button, wasQueued, timeDiff, isSingleClick, isDoubleClick, isHold);

        if(isDoubleClick){
            startPlaylistOnDevice("Bakgrundsmusik", "WORKSTATION");
        }

    }

    private void startPlaylistOnDevice(String playlist, String device) {
        Spotify.getPlayer();

    }
}
