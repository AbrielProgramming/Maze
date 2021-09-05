Point2D center = new Point2D.Float((player.getOccupiedSpot().getX()*pixelConstant+5), (player.getOccupiedSpot().getY()*pixelConstant+5));
	     float radius = 100;
	     float[] dist = {0.1f, 0.3f, 1.0f};
	     Color[] colors = {new Color(0,0,0,0), new Color(0,0,0,0), new Color(0,0,0,0)};
	     RadialGradientPaint p =new RadialGradientPaint(center, radius, dist, colors);
	 
	     g2.setPaint(p);
	     g2.fillRect(0, 0, gridWidth()*pixelConstant, gridHeight()*pixelConstant);
