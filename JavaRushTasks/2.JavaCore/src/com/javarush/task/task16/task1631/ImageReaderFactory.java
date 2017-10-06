package com.javarush.task.task16.task1631;

import com.javarush.task.task16.task1631.common.*;

/**
 * 05.10.2017
 * 22:06
 * Created by Roxy
 */
public class ImageReaderFactory {
    public static ImageReader getImageReader(ImageTypes imageType) { //когда вызываем метод и передаем BMP
                                                                     //то создается соответствующий обїект и тд
            if (imageType == ImageTypes.BMP) {
                return new BmpReader();
            } else if (imageType == ImageTypes.JPG) {
                return new JpgReader();
            } else if (imageType == ImageTypes.PNG) {
                return new PngReader();
            } else {
                throw new IllegalArgumentException("Неизвестный тип картинки");
            }
    }
}
