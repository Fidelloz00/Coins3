/*
 * This file is part of coins3
 *
 * Copyright © 2020 Beelzebu
 *
 * This program is free software: you can redistribute it and/or modify it under
 * the terms of the GNU Affero General Public License as published by the Free
 * Software Foundation, either version 3 of the License, or (at your option) any
 * later version.
 *
 * This program is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Affero General Public License for more
 * details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program. If not, see <http://www.gnu.org/licenses/>.
 */
package com.github.beelzebu.coins.velocity;

import com.github.beelzebu.coins.api.config.CoinsConfig;
import com.github.beelzebu.coins.common.plugin.CommonCoinsPlugin;
import com.github.beelzebu.coins.velocity.listener.LoginListener;
import org.jetbrains.annotations.NotNull;

/**
 * @author Beelzebu
 */
public class CoinsVelocityPlugin extends CommonCoinsPlugin<CoinsVelocityMain> {

    public CoinsVelocityPlugin(@NotNull CoinsVelocityMain bootstrap, CoinsConfig config) {
        super(bootstrap, config);
    }

    @Override
    public void enable() {
        super.enable();
        CoinsVelocityMain coinsVelocityMain = getBootstrap();
        coinsVelocityMain.getProxyServer().getEventManager().register(coinsVelocityMain, new LoginListener(this));
    }
}
