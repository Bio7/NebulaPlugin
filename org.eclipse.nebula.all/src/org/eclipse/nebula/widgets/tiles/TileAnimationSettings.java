/*****************************************************************************
 * Copyright (c) 2014, 2021 Fabian Prasser, Laurent Caron
 *
 *
 * This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License 2.0
 * which accompanies this distribution, and is available at
 * https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 * Fabian Prasser - Initial API and implementation
 * Laurent Caron <laurent dot caron at gmail dot com> - Integration into the Nebula Project
 *****************************************************************************/
package org.eclipse.nebula.widgets.tiles;

/**
 * This class encapsulates settings for the animation
 *
 * @author Fabian Prasser
 */
public class TileAnimationSettings {

	/** FPS*/
	private final int fps;
	/** Duration in milliseconds*/
	private final int duration;
	/** Duration per frame in milliseconds*/
	private final int delta;

	/**
	 * Creates a new instance
	 * @param fps
	 * @param duration
	 */
	public TileAnimationSettings(final int fps, final int duration){
		this.fps = fps;
		this.duration = duration;
		delta = (int)(1000d / fps);
	}

	/**
	 * Returns the duration in milliseconds
	 * @return
	 */
	public int getDuration() {
		return duration;
	}

	/**
	 * Returns the frames per second
	 * @return
	 */
	public int getFPS() {
		return fps;
	}

	/**
	 * Returns the milliseconds per frame
	 * @return
	 */
	protected int getDelta() {
		return delta;
	}
}
