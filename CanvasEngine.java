package *.product.com.canvaslibrary;

import java.util.ArrayList;

/** CanvasEngine
	 *
	 * Author: David A. 2016, Copyright 2021
	 *
	 * */

public class CanvasEngine {
	
	
	private Context mContext;
	private float tile = 0;
	private float tw = 0;
	private float tt = 0;

	
	public CanvasEngine(Context context, float tile, float tw, float tt) {
		// TODO Auto-generated constructor stub
		
		this.mContext = context;
		
		this.tile = tile;
		this.tw = tw;
		this.tt = tt;
		
		initialize();
		
	}

	
	public void initialize() {
		
	}
	

	private Canvas g_canvas;
	private int g_layout = 0;
	private float split = 0f;
	
	
	/// ### READING THE DATA STRUCTURE, from file CanvasGraphic.java

	
	public void squareshape(Canvas canvas, int layout, float[][][][] dimensional4, float fx, float fy, int index ) {
		
		g_layout = layout;
		
		g_canvas = canvas;
		
		int s_gon = 0;
		
		float stdW = dimensional4[s_gon][0][0][0]; // w
		float stdH = dimensional4[s_gon][0][1][0]; // h
		
		float quadx = (stdW*0.1f);
		float quady = (stdH*0.1f);	
		
		
		float col = 0; float rows = 0;
		if( dimensional4[s_gon][0].length == 4 ) {
			
			col = dimensional4[s_gon][0][3][0]; // col
			rows = dimensional4[s_gon][0][3][1]; // rows
			
			stdW *= col;
			stdH *= rows;
			
			quadx = ((stdW/col)*0.1f);
			quady = ((stdH/rows)*0.1f);	
		}
		
		
		
		
		float shapes = dimensional4[s_gon][0][2][0]; // s
		
		int sqlength = (int) shapes;
		
		int d_index = sqlength / 4;
		
		int c_index = 1;
		
		int start1 = 0;  
		
		int drawer = 1;
		
		if( index > 2 ) {
			drawer = 0;
		}
		
		// start += 2;
		
		int start = 0;    // tiled index
		int ntx = 1, nty = 1;
		float tx = fx; float ty = fy;

		for( int sq = 0; sq<sqlength; sq++ ) {
			
				int colorL = dimensional4[s_gon][1+start][1].length;
				
				String[] strColor = new String[colorL];
				
				if( dimensional4[s_gon][1+start][1].length > 0 ) {
					
					for( int c = 0; c<colorL; c++ ) {
						
						int colorx0 = (int) dimensional4[s_gon][1+start][1][c]; // c
						
						strColor[c] = String.format("#%06X", 0xFFFFFF & colorx0);
					}
					
				} else {
					
					int colorx0 = (int) dimensional4[s_gon][1+start][1][0]; // c
					
					strColor[0] = String.format("#%06X", 0xFFFFFF & colorx0);
				}
				
				
				float type = dimensional4[s_gon][1+start][0][0]; // t
					
				int vars = 0;
			
				if( dimensional4[s_gon][1+start][0].length == 2 ) {  
					
					vars = (int) dimensional4[s_gon][1+start][0][1]; // t
					
				}

				int stroke = 0;

				if( dimensional4[s_gon][1+start][0].length == 3 ) {

					stroke = (int) dimensional4[s_gon][1+start][0][2]; // s
				}
				
			/*
				{ { type+0, vars+10 }, { Color.parseColor("#FFFFFF") } },
				{ { 2, 3, 4, 5, 7   }, { 3, 3 } }, 
			*/
				
				
				
				float squaretype[][] = dimensional4[s_gon][2+start];
				
				float a_points[][] = squaretype;
				
				
				if( vars == 10 ) {
					
					
					a_points = pixelRect(a_points[0], (int)a_points[1][0], (int)a_points[1][1]);
					
				}
				
				
				if( dimensional4[s_gon][0][2].length == 3 ) {
					float splitC = dimensional4[s_gon][0][2][2]; // split
					
					if( splitC == 1 ) {
					
						if( ntx == 1 ) {
							tx += split;
							
							ntx = 0;
						}
						if( nty == 1 ) {
							ty += split;
							
							nty = 0;
						}
						
					}
				}
				
			
				
			if( vars != 7 && drawer == 1 ) {
				tree( tx, ty, a_points, quadx, quady, (int)type+0, strColor , new int[]{ vars, stroke } );
			
			}
			
			if( vars == 7 && drawer == 1 ) {
				 quad(tx, ty, a_points, quadx, quady, (int)type+0, strColor , new int[]{ vars } );
				
			}
			
			
			if( dimensional4[s_gon][1+start].length == 3 ) {
				float pos = dimensional4[s_gon][1+start][2][0]; // pos
				
				//s_gonborder("#222222", 0.1f, quadx, quady, tx, ty);
				
				if( pos == 1 ) {
					tx += 10f + split;
					ntx = 1;
					
					c_index++;
				}
				
				if( pos == 2 ) {
					tx = 0;
					ty += 10f + split;
					nty = 1;
					
					c_index++;
				}
				
			
				
				
				if( pos == 1 || pos == 2 ) {
					if( index != 0 ) {
						
						if( c_index == index ) {
							drawer = 1;
						} else {
							drawer = 0;
						}
						
						tx = 0;
						ty = 0;
					}
					
				}
				
			} 
			
			start += 2;
			
			
			
		}
		
		//s_gonborder("#222222", 0.2f, quadx, quady, tx, ty);
		float border = 0;
		
		if( dimensional4[s_gon][0][2].length == 2 ) {
			border = dimensional4[s_gon][0][2][1]; // border
			
			if( border == 1 ) {
				s_gonborder("#222222", 0.2f, quadx, quady, tx, ty);
			}
		}
	
		
		
	}
	
	
	public void drawPixel() {
		
		
		int pixel[][] = new int[][] {
			
			{ 1,1,1,2,2,2,2,2 },
			{ 1,1,1,2,2,2,2,2 },
			{ 1,1,1,2,2,1,1,1 },
			{ 2,2,2,2,2,1,1,1 },
			{ 2,2,2,2,2,1,1,1 },
			
			{ 1, 1, 1, 1, 1, 1, 1 },
			{ 1, 1, 1, 1, 1, 1, 1 },
			{ 1, 1, 1, 1, 1, 1, 1 },
			{ 1, 1, 1, 1, 1, 1, 1 },
			{ 1, 1, 1, 1, 1, 1, 1 },
			
			
		};
		
	}
	
	
	
	//### PIXEL RECT SOLUTION, square shapes, 3 x 3 grid, draw tiles by numbers 1 - 9
	

	public float [][] pixelRect( float[] numbers1, int sizeX, int sizeY ) {
		
		
		/* Shape examples
		
		float numbers1[] = { 2, 3, 4, 5, 7 }; //
		
		float numbers0[] = { 3, 4, 5, 9 }; // 
		*/
		
		float cWidth = 10 / sizeX;
		float cHeight = 10 / sizeY;
		
		int clength = sizeX * sizeY;
		
		int r = 0;
		
		float rectPixel[][] = new float[numbers1.length*5][2]; 
		
		int n = 0;
		
		float cx = 0, cy = 0;
		
		for( int c = 1; c<(clength+1); c++ ) {
			
			float pos = 0;
			
			if( n < numbers1.length ) {
				pos = numbers1[n];
			}
			
			if( pos == c ) {
				
					rectPixel[r+0][0] = cx*cWidth;
					rectPixel[r+0][1] = cy*cHeight;
				
					rectPixel[r+1][0] = cx*cWidth;
					rectPixel[r+1][1] = (cy+1)*cHeight;
				
					rectPixel[r+2][0] = (cx+1)*cWidth;
					rectPixel[r+2][1] = (cy+1)*cHeight;
				
					rectPixel[r+3][0] = (cx+1)*cWidth;
					rectPixel[r+3][1] = cy*cHeight;
				
					rectPixel[r+4][0] = cx*cWidth;
					rectPixel[r+4][1] = cy*cHeight;
				
				r += 5;
				
				n++;
			}
			
			cx++;
			
			if( cx == sizeX ) {
				
				
				cx = 0;
				cy++;
			}
			 
		}
		
		
		/*
		 tree(x*tile, y*tile, 0, 0, rectPixel,
	    		   quadx+((w*tile)*0.1f), quady+((h*tile)*0.1f), 0, colors, new float[]{10} );	
		
		*/
		
		return rectPixel;
		
		
	}
	
	
	
	
	
	// ## BEZIER CURVE SHAPE SOLUTION ###
	
	public void quad(float x_base, float y_base, float[][] a_points,
			float quadx, float quady, int style, String[] color, int[] vars ) {
		
		float ux = 0;
		float uy = 0;
		
		float x_var = 0;
	  	float y_var = 0;
	  	
	  	float x2_var = 0, y2_var = 0;
	  	
	  	Path path02 = new Path();

		Canvas can = new Canvas();

	  	
	 	float p_height = 0;
	  	float p_width = 0;
	  	float p_x = 100;
	  	float p_y = 100;
	  	
		if( REPLACE_CANVAS ==  1) {
		  	  ux = x_base*tile;
			  uy = y_base*tile;
				
		  	}
	  	
			/*
		float qsx = 2;
		float qsy = 2;
		float qsw = 2;

		path02.moveTo(0, quady*5);

		//path02.quadTo(quadx*10, quady*5, quadx*5, 0);

		path02.quadTo(quadx*5, quady*0, quadx*10, quady*5);

		path02.lineTo(0, quady*5);

		*/
    	
	  	
	  	path02.moveTo( ((x_base + a_points[0][0])*quadx) + ux, ((y_base + a_points[0][1])*quady) + uy );
	  	
	  	
	  	int c_end = a_points.length;
	  	for(int c = 0; c<c_end; c++ ) {
	  		
	  		x_var = (x_base + a_points[c][0]);
		  	y_var = (y_base + a_points[c][1]);
		  		
		  	
		  	if( a_points[c].length == 2 ) {
		  	
		 // 	path02.lineTo( (x_var*quadx) + ux, (y_var*quady) + uy );
	  		
		  	}
		  	
		  	
		  	if( a_points[c].length == 4 ) {
		  	
		  	x2_var = (x_base + a_points[c][2]);
		  	y2_var = (x_base + a_points[c][3]);
		  	
		  	path02.quadTo( (x2_var*quadx) + ux, (y2_var*quady) + uy, (x_var*quadx) + ux, (y_var*quady) + uy );
	  		
		  	}
		  	
		  	
	  		if( x_var > center_x ) { center_x = x_var; }
	  		if( y_var > center_y ) { center_y = y_var; }
	  		
	  		
	  		
	  		if( x_var > p_width ) { p_width = x_var; }
	  		if( y_var > p_height ) { p_height = y_var; }
	  		
	  		
	  		if( p_x == 100 ) { p_x = x_var; }
	  		if( p_y == 100 ) { p_y = y_var; }
	  		
	  		
	  		
	  	}
	  	
	  	
	  	if( vars[0] == 7 ) {
	  		
	  		float r_var = p_width - p_x;
	  		
	  		path02.addCircle( ((p_x + (r_var/2))*quadx) + ux, (((p_y + (r_var/2))*quady)) + uy, ((r_var/2)*quadx), Direction.CW);
		  	
	  	}
	  	
	  	path02.moveTo( ((x_base + a_points[0][0])*quadx) + ux, ((y_base + a_points[0][1])*quady) + uy );
	  	
	  	/*
	  	, new float [][] {
			{ 5, 5, 1 }
	  	
	  	*/
    	
    	
		Paint paint = new Paint();

		paint.setColor(Color.parseColor(color[0]));

	    paths.add(path02);
	    paints.add(paint);
	
		
	}
	
	
	
	public ArrayList<Path> getPath() {
		return this.paths;
	}
	
	
	public ArrayList<Paint> getPaint() {
		return this.paints;
	}
	
	
	
	ArrayList<Path> paths = new ArrayList<Path>();
	ArrayList<Paint> paints = new ArrayList<Paint>();
	
	float center_x = 0;
	float center_y = 0;
	
	
	int REPLACE_CANVAS = 0;
	
	
	public void tree(float x_base, float y_base, float[][] a_points,
			float quadx, float quady, int style, String[] color, int[] vars ) {

			// style is type.


			center_x = 0;
			center_y = 0;
			
			
			float x_var = 0;
		  	float y_var = 0;
		  	
		  	Path path02 = new Path();
		  	
		  	float ux = 0;
		  	float uy = 0; 
		  	
		  	
		  	float p_height = 0;
		  	float p_width = 0;
		  	float p_x = 100;
		  	float p_y = 100;
		  	
		  	
		  	if( REPLACE_CANVAS ==  1) {
		  	  ux = x_base*tile;
			  uy = y_base*tile;
				
		  	}


		  	int stroke = 1;

		    if( vars.length > 1 ) {

				stroke = vars[1];
		    }

		  	
		  	path02.moveTo( ((x_base + a_points[0][0])*quadx) + ux, ((y_base + a_points[0][1])*quady) + uy );
		  	
			int move = 0;
		  	
		  	int c_end = a_points.length;
		  	for(int c = 0; c<c_end; c++ ) {
		  		
		  		x_var = (x_base + a_points[c][0]);
			  	y_var = (y_base + a_points[c][1]);
			  		
			  	
				if( a_points[c].length == 2 ) {
			  	
		  		path02.lineTo( (x_var*quadx) + ux, (y_var*quady) + uy );
		  		
		  		
		  		if( vars.length > 0 && vars[0] == 10 ) {
			  		
				  	move++;
					
			  		if( move == 5 ) {
			  			
			  			path02.moveTo( (x_var*quadx) + ux, (y_var*quady) + uy );
			  			
			  			move = 0;
			  		}

			  	}
		  		
		  		
				}
		  		
		  		
		  		if( a_points[c].length == 3 ) {
			  		
			  		float r_var = (x_base + a_points[c][2]);
			  		
			  		path02.addCircle((x_var*quadx) + ux, (y_var*quady) + uy, (r_var*quadx), Direction.CW);
				  	
			  	}
		  		
		  		
		  		if( x_var > center_x ) { center_x = x_var; }
		  		if( y_var > center_y ) { center_y = y_var; }
		  		
		  		
		  		if( x_var > p_width ) { p_width = x_var; }
		  		if( y_var > p_height ) { p_height = y_var; }
		  		
		  		
		  		if( p_x == 100 ) { p_x = x_var; }
		  		if( p_y == 100 ) { p_y = y_var; }
		  		
		  		
		  	}
		  	
		  	
		  	path02.moveTo( ((x_base + a_points[0][0])*quadx) + ux, ((y_base + a_points[0][1])*quady) + uy );
		  	
		  	
		  	p_width = p_width - p_x;
		  	p_height = p_height - p_y;
		  	
		  	
		  	
		  	
		  	
		  	center_x = (center_x-a_points[0][0])/2;
		  	center_y = (center_y-a_points[0][1])/2;
		  	
		  	Paint paint;
			paint = new Paint();
		  	
			if( style == 10 ) {
				paint.setColor(Color.TRANSPARENT);
			}
		  	
			if( style == 0 ) {
				
				paint.setColor(Color.parseColor(color[0]));
				
			}
			
			
			
			if( style == 1 ) {
				
				
				paint.setStyle(Style.STROKE);
				paint.setColor(Color.BLACK);
			}
			
			
			if( style == 2 ) {
				
				
				paint.setStyle(Style.STROKE);

				paint.setStrokeWidth(stroke);

				paint.setColor(Color.parseColor(color[0]));


			}
			
			
			if( style == 3 ) {
				
				
				paint.setStyle(Style.STROKE);
				paint.setStrokeWidth(1);
				paint.setColor(Color.parseColor(color[0]));
			}
			
			
			if( style == 4 ) {
				
				int top = 10;
				int bottom = 0;
				String grey = "#CCCCCC";
				
				if( vars.length > 0 ) {
					
					if( vars[0] == 0 ) {
						bottom = 10;
						top = 0;
					}
					if( vars[0] == 1 ) {
						top = 10;
						bottom = 0;
					}
					if( vars[0] == 2 ) {
						top = 20;
						bottom = 0;
					}
					if( vars[0] == 3 ) {
						top = 0;
						bottom = 20;
					}
					
					String greys[] = {
							"#000000", "#AAAAAA", "#BBBBBB", "#CCCCCC", "#DDDDDD", "#EEEEEE", "#FFFFFF"
					};
					
					

					String greysh[] = {
							"#1D1D1D", "#313131", "#484848", "#616161",
							"#7B7B7B", "#959595", "#AFAFAF", "#CACACA", 
							"#E5E5E5"
					};
					
					
					grey = greys[vars[1]];
					
				}
				
				
				paint.setDither(true);
			    paint.setAntiAlias(true);
			    paint.setStyle(Style.FILL);
			    
			    paint.setShader(new LinearGradient(0, quady*top, 0, quady*bottom, 
					new int[] {
			    		Color.parseColor(grey),  
			    		Color.parseColor(color[0])
			    		} , 
					null, TileMode.CLAMP));
				
			}
			
			
			if( style == 5 ) {


				 //
				
				
				int top = 10;
				int bottom = 0;
				
				
				int colorL = color.length;
				
				int colorShades[] = new int[colorL];
				
				
				for( int c = 0; c<colorL; c++ ) {
					
					if( color[c] != null ) {
						
						colorShades[c] = Color.parseColor(color[c]);


						if( c == (0) && vars[0] == 3 ) {  // 

							color[c] = color[c].substring(1, color[c].length());

							color[c] = "#" + "00" + color[c];

							colorShades[c] = Color.parseColor(color[c]);

						}


					}
					
				}
				
				
				
				paint.setDither(true);
			    paint.setAntiAlias(true);
			    paint.setStyle(Style.FILL);
			   
			    
			   /*
			    paint.setShader(new LinearGradient( 0,  quady*top,  0,  quady*bottom, 
			    		colorShades, 
					null, TileMode.CLAMP));
			    */
			    
			    
			    
			    float positions[] = new float[4];
			   
			  //  float positions[] = { 0.0f, 0.2f, 0.5f, 1f };
			    
			    if( vars[0] != 2 ) {
			    	positions = null;
			    }
			    if( vars[0] == 2 ) {
			    	positions = new float[] { 0.0f, 0.2f, 0.7f, 1f };
			    }
			    
			    
			    if( vars[0] == 3 ) {  // 
			    	
			    	positions = new float[] { 0.0f, 0.1f, 0.9f, 1.4f };
			    	
			    }
			    
			  
			    paint.setShader(new LinearGradient(
			    		(x_base*tile) + 0, (y_base*tile) + quady*top, (x_base*tile) + 0, (y_base*tile) + quady*bottom, 
			    		colorShades, 
			    		positions, TileMode.CLAMP));
				
			}
			
			
			
			if( style == 6 ) {
				
				
				String opacity[] = { 
						"FF", "E6", "CC", 
						"B3", "99", "80", 
						"66", "4D", "40", "33",
						"26", "1A", "0D", "00" } ;
				
				
				/*
				 * 100% � FF
					95% � F2
					90% � E6
					85% � D9
					80% � CC
					75% � BF
					70% � B3
					65% � A6
					60% � 99
					55% � 8C
					50% � 80
					45% � 73
					40% � 66
					35% � 59
					30% � 4D
					25% � 40
					20% � 33
					15% � 26
					10% � 1A
					5% � 0D
					0% � 00
				 * 
				 */
				
				String d45 = "";

				int opL = opacity.length;
				
				int colorL = color.length;
				
				int colorShades[] = new int[colorL];
				

				for( int c = 0; c<colorL; c++ ) {
					
					if( color[c] != null ) {
						
						color[c] = color[c].substring(1, color[c].length());
						
						
						int o = (opL - colorL) + c;
						
						if( c == colorL-1 ) {
						
							o = opacity.length-1;
						}

						color[c] = "#" + opacity[o] + color[c];


						colorShades[c] = Color.parseColor(color[c]);
					}

				}
				
				
				paint.setDither(true);
			    paint.setAntiAlias(true);
			    
			    paint.setStyle(Style.FILL);
			    
				
				paint.setShader(new RadialGradient( (x_base*tile) + (center_x*quadx), (y_base) + (center_y*quady), (center_x*quadx),
						colorShades,
						null, TileMode.CLAMP));
				
				/*
				paint.setShader(new RadialGradient( ((quadx*10)/2), (quady*10)/2, ((quadx*10)/2) - ( quadx*0.4f),
						colorShades,
						null, TileMode.CLAMP));
				*/
				
			}
			
			
			if( style == 7 ) {
				
				paint.setColor(Color.parseColor(color[0]));
				
				paint.setAlpha(60);
			}
			
			
			
			//TODO
			
			if( style == 8 ) {
				
				String opacity[] = { 
						"FF", "E6", "CC", 
						"B3", "99", "80", 
						"66", "4D", "40", "33",
						"26", "1A", "0D", "00" } ;
				
				int opL = opacity.length;
				
				int colorL = color.length;
				
				int colorShades[] = new int[colorL];
				
				
				for( int c = 0; c<colorL; c++ ) {
					
					if( color[c] != null ) {
						
						color[c] = color[c].substring(1, color[c].length());
						
						
						int o = (opL - colorL) + c;
						
						if( c == colorL-1 ) {
						
							o = opacity.length-1;
						}
						
						
						color[c] = "#" + opacity[o] + color[c];
						
						
						colorShades[c] = Color.parseColor(color[c]);
					}
					
				}
				
				
				
				float x0 = 0, x1 = 0;
				float y0 = 0, y1 = 1;
				
				
				float gq_y = (quady*p_height) / 10;
				float gq_x = (quadx*p_width) / 10;
				
				
				if( vars[0] == 1 ) {  // left - right
					x0 = p_x; x1 = p_x+p_width; y0 = 0; y1 = 0;
				}
				if( vars[0] == 2 ) {  // rigth - left
					x0 = p_x+p_width; x1 = p_x; y0 = 0; y1 = 0;
				}
				if( vars[0] == 3 ) {  // top - bottom
					x0 = 0; x1 = 0; y0 = p_y; y1 = p_y+p_height;
				}
				if( vars[0] == 4 ) { // bottom - top
					x0 = 0; x1 = 0; y0 = p_y+p_height; y1 = p_y;
				}
				
				paint.setDither(true);
			    paint.setAntiAlias(true);
			    
			    paint.setStyle(Style.FILL);
			    
				
				paint.setShader(new LinearGradient( (x_base*tile)+(x0*quadx), (y_base*tile)+(y0*quady), (x_base*tile)+(x1*quadx), (y_base*tile)+(y1*quady), colorShades, null, TileMode.CLAMP));
				
				
				
			}
			
			  /*
			
		    paths.add(path02);
		    paints.add(paint);
		
		   */
		    
		    if( g_layout == 1 ) {
		    
		    g_canvas.drawPath(path02, paint);
		    
		    }
		   
		    
	}
		
	
	
	
	
	
	
	
	

	
	private void s_gonborder(String color, float strokeW, float quadx, float quady, float x, float y ) {
	
		  //// *** Border 
		  
		  float stW = strokeW;
		
		  
		  String[] sC = new String[1];
		  
		  sC[0] = color;
		  
		  
		  float drx1 = 0, dry1 = 0, drw1 = 10, drh1 = stW;
		  
		  tree( 0, 0, new float[][] {
				  {x+drx1, y+dry1},
				  {x+drx1, y+dry1+drh1},
				  {x+drx1+drw1,y+dry1+drh1},
				  {x+drx1+drw1, y+dry1},
				  {x+drx1, y+dry1},
	    		  }, quadx, quady, 0, sC, new int[]{} );	 
		  
		  float drx2 = 0, dry2 = 0, drw2 = stW, drh2 = 10;
		  
		  tree( 0, 0, new float[][] {
				  {x+drx2, y+dry2},
				  {x+drx2, y+dry2+drh2},
				  {x+drx2+drw2,y+dry2+drh2},
				  {x+drx2+drw2, y+dry2},
				  {x+drx2, y+dry2},
	    		  }, quadx, quady, 0, sC, new int[]{} );	
		  
		  float drx3 = 0, dry3 = 10-stW, drw3 = 10, drh3 = stW;
		  
		  tree( 0, 0, new float[][] {
				  {x+drx3, y+dry3},
				  {x+drx3, y+dry3+drh3},
				  {x+drx3+drw3,y+dry3+drh3},
				  {x+drx3+drw3, y+dry3},
				  {x+drx3, y+dry3},
	    		  }, quadx, quady, 0, sC, new int[]{} );	
		  
		  float drx4 = 10-stW, dry4 = 0, drw4 = stW, drh4 = 10;
		  
		  tree( 0, 0, new float[][] {
				  {x+drx4, y+dry4},
				  {x+drx4, y+dry4+drh4},
				  {x+drx4+drw4,y+dry4+drh4},
				  {x+drx4+drw4, y+dry4},
				  {x+drx4, y+dry4},
	    		  }, quadx, quady, 0, sC, new int[]{} );	
		   
		  
		  //// *******
		
		
	}
	
	
	
	
	
	
	
	
	
	/***
	 *
	 *
	 *
	
	
	
	
				{ //s_gon 11  bricks tiled
					
					{ { 3*tile },{ 3*tile }, { shapes+17, border+1 }, { col+6, rows+2 } },
					
					
					
					
					{ { type+0 }, { Color.parseColor(pcolor[0][0]) } },
					{ { sx+xy3d[0][0], sy+xy3d[0][1] },{ sx+xy3d[1][0], sy+xy3d[1][1] },{ sx+xy3d[2][0]+xy3d[0][0], sy+xy3d[2][1] }, { sx+xy3d[3][0], sy+xy3d[3][1] }, { sx+xy3d[0][0], sy+xy3d[0][1] }  }, 
					
					{ { type+0 }, { Color.parseColor(pcolor[0][1]) }, { pos+1 } },
					{ { sx+xy3d[1][0], sy+xy3d[1][1] },{ sx+xy3d[4][0], sy+xy3d[4][1] },{ sx+xy3d[5][0]+xy3d[0][0], sy+xy3d[5][1] }, { sx+xy3d[2][0]+xy3d[0][0], sy+xy3d[2][1] }, { sx+xy3d[1][0], sy+xy3d[1][1] }  }, 
					
					
					
					
					{ { type+0 }, { Color.parseColor(pcolor[0][0]) } },
					{ { sx+0, sy+xy3d[0][1] },{ sx+xy3d[1][0], sy+xy3d[1][1] },{ sx+xy3d[2][0]+xy3d[0][0], sy+xy3d[2][1] }, { sx+xy3d[3][0], sy+xy3d[3][1] }, { sx+xy3d[0][0], sy+xy3d[0][1] }  }, 
					
					{ { type+0 }, { Color.parseColor(pcolor[0][1]) }, { pos+1 } },
					{ { sx+xy3d[1][0], sy+xy3d[1][1] },{ sx+xy3d[4][0], sy+xy3d[4][1] },{ sx+xy3d[5][0]+xy3d[0][0], sy+xy3d[5][1] }, { sx+xy3d[2][0]+xy3d[0][0], sy+xy3d[2][1] }, { sx+xy3d[1][0], sy+xy3d[1][1] }  }, 
					
					
					
					{ { type+0 }, { Color.parseColor(pcolor[0][0]) } },
					{ { sx+0, sy+xy3d[0][1] },{ sx+xy3d[1][0], sy+xy3d[1][1] },{ sx+xy3d[2][0], sy+xy3d[2][1] }, { sx+xy3d[3][0], sy+xy3d[3][1] }, { sx+xy3d[0][0], sy+xy3d[0][1] }  }, 
					
					{ { type+0 }, { Color.parseColor(pcolor[0][1]) } },
					{ { sx+xy3d[1][0], sy+xy3d[1][1] },{ sx+xy3d[4][0], sy+xy3d[4][1] },{ sx+xy3d[5][0], sy+xy3d[5][1] }, { sx+xy3d[2][0], sy+xy3d[2][1] }, { sx+xy3d[1][0], sy+xy3d[1][1] }  }, 
					
					{ { type+0 }, { Color.parseColor(pcolor[0][2]) }, { pos+1 } },
					{ { sx+xy3d[2][0], sy+xy3d[2][1] },{ sx+xy3d[5][0], sy+xy3d[5][1] },{ sx+xy3d[6][0], sy+10 }, { sx+xy3d[3][0], sy+xy3d[3][1] }, { sx+xy3d[2][0], sy+xy3d[2][1] }  }, 
					
					
					
					
					
					{ { type+0 }, { Color.parseColor(pcolor[0][1]) }, { pos+1 } },
					{ { sx+xy3d[1][0]+2, sy+0 },{ sx+xy3d[4][0]+2, sy+xy3d[4][1] },{ sx+xy3d[5][0]+2, sy+xy3d[5][1] }, { sx+xy3d[2][0]+2, sy+0 }, { sx+xy3d[1][0]+2, sy+0 }  }, 
					
					
					
					{ { type+0 }, { Color.parseColor(pcolor[0][1]) } },
					{ {0, 0}, {0, th-d+fh}, {10, th-d+fh}, {10, 0}, {0, 0}  }, 
					
					{ { type+0 }, { Color.parseColor(pcolor[0][0]) } },
					{ {sw+skew-d, 0}, {sw, th-d}, {sw+pw-d, th-d}, {sw+skew-d, 0} },
					
					{ { type+0 }, { Color.parseColor(pcolor[0][2]) }, { pos+1 } },
					{ {sw, 0}, {sw, th-d}, {sw+pw-d, 0}, {sw, 0} },


					
					

					{ { type+0 }, { Color.parseColor(pcolor[0][1]) } },
					{ { sx+xy3d[1][0], sy+0 },{ sx+xy3d[4][0], sy+xy3d[4][1] },{ sx+xy3d[5][0], sy+xy3d[5][1] }, { sx+xy3d[2][0], sy+0 }, { sx+xy3d[1][0], sy+0 }  }, 
					
					{ { type+0 }, { Color.parseColor(pcolor[0][2]) }, { pos+2 } },
					{ { sx+xy3d[2][0], sy+0 },{ sx+xy3d[5][0], sy+xy3d[5][1] },{ sx+xy3d[6][0], sy+10 }, { sx+xy3d[3][0], sy+xy3d[3][1] }, { sx+xy3d[2][0], sy+0 }  }, 
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					{ { type+0 }, { Color.parseColor(pcolor[0][1]) }, { pos+1 } },
					{ { sx+xy3d[1][0], sy+0 },{ sx+xy3d[4][0], sy+xy3d[4][1] },{ sx+xy3d[5][0]+xy3d[0][0], sy+xy3d[5][1] }, { sx+xy3d[2][0]+xy3d[0][0], sy+0 }, { sx+xy3d[1][0], sy+0 }  }, 
					
					
					
					
					{ { type+0 }, { Color.parseColor(pcolor[0][1]) }, { pos+1 } },
					{ { sx+xy3d[1][0], sy+0 },{ sx+xy3d[4][0], sy+xy3d[4][1] },{ sx+xy3d[5][0]+xy3d[0][0], sy+xy3d[5][1] }, { sx+xy3d[2][0]+xy3d[0][0], sy+0 }, { sx+xy3d[1][0], sy+0 }  }, 
					
					
					
					
					{ { type+0 }, { Color.parseColor(pcolor[0][1]) } },
					{ { sx+xy3d[1][0], sy+0 },{ sx+xy3d[4][0], sy+xy3d[4][1] },{ sx+xy3d[5][0], sy+xy3d[5][1] }, { sx+xy3d[2][0], sy+0 }, { sx+xy3d[1][0], sy+0 }  }, 
					
					{ { type+0 }, { Color.parseColor(pcolor[0][2]) }, { pos+1 } },
					{ { sx+xy3d[2][0], sy+0 },{ sx+xy3d[5][0], sy+xy3d[5][1] },{ sx+xy3d[6][0], sy+xy3d[6][1] }, { sx+xy3d[3][0], sy+xy3d[3][1] }, { sx+xy3d[2][0], sy+0 }  }, 
					
					
					
					
					
					
					
					

					{ { type+0 }, { Color.parseColor(pcolor[0][1]) } },
					{ {0, 0}, {0, th-d+fh}, {pw, th-d+fh}, {pw, 0},  {0, 0} }, 
					
					{ { type+0 }, { Color.parseColor(pcolor[0][2]) }, { pos+1 } },
					{ {pw, 0}, {pw, th-d+fh}, {pw+skew-d, fh}, {pw+skew-d, 0},{pw, 0} }, 
					
					
					
					
					
					
					
					
					
					
					
					
					
					{ { type+0 }, { Color.parseColor(pcolor[0][0]) } },
					{ { sx+xy3d[0][0], sy+xy3d[0][1] },{ sx+xy3d[1][0], sy+xy3d[1][1] },{ sx+xy3d[2][0], sy+xy3d[2][1] }, { sx+xy3d[3][0], sy+xy3d[3][1] }, { sx+xy3d[0][0], sy+xy3d[0][1] }  }, 
					
					{ { type+0 }, { Color.parseColor(pcolor[0][1]) } },
					{ { sx+xy3d[1][0], sy+xy3d[1][1] },{ sx+xy3d[4][0], sy+xy3d[4][1] },{ sx+xy3d[5][0], sy+xy3d[5][1] }, { sx+xy3d[2][0], sy+xy3d[2][1] }, { sx+xy3d[1][0], sy+xy3d[1][1] }  }, 
					
					{ { type+0 }, { Color.parseColor(pcolor[0][2]) }, { pos+1 } },
					{ { sx+xy3d[2][0], sy+xy3d[2][1] },{ sx+xy3d[5][0], sy+xy3d[5][1] },{ sx+xy3d[6][0], sy+xy3d[6][1] }, { sx+xy3d[3][0], sy+xy3d[3][1] }, { sx+xy3d[2][0], sy+xy3d[2][1] }  }, 
					
					
					
					
					
					
					
				}
	
	
	
	
	
	
	
	
	
	
	
	
	 *
	 *
	 * 
	 */
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
