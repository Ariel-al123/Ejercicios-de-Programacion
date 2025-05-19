#include <SFML/Graphics.hpp>
#include <cmath>
#include <iostream>

// Convierte HSV a RGB
sf::Color HSVtoRGB(float h, float s, float v) {
    int i = int(h * 6);
    float f = h * 6 - i;
    float p = v * (1 - s);
    float q = v * (1 - f * s);
    float t = v * (1 - (1 - f) * s);
    float r, g, b;

    switch (i % 6) {
        case 0: r = v, g = t, b = p; break;
        case 1: r = q, g = v, b = p; break;
        case 2: r = p, g = v, b = t; break;
        case 3: r = p, g = q, b = v; break;
        case 4: r = t, g = p, b = v; break;
        case 5: r = v, g = p, b = q; break;
    }

    return sf::Color(r * 255, g * 255, b * 255);
}

int main() {
    const int windowSize = 600;
    const int radius = 250;
    sf::RenderWindow window(sf::VideoMode(windowSize, windowSize), "Selector de Color Circular");
    sf::Image colorWheelImage;
    colorWheelImage.create(windowSize, windowSize, sf::Color::White);

    sf::Vector2f center(windowSize / 2, windowSize / 2);

    // Dibujar círculo de color (color wheel)
    for (int x = 0; x < windowSize; ++x) {
        for (int y = 0; y < windowSize; ++y) {
            float dx = x - center.x;
            float dy = y - center.y;
            float dist = std::sqrt(dx * dx + dy * dy);
            if (dist <= radius) {
                float angle = std::atan2(dy, dx);
                float hue = (angle + M_PI) / (2 * M_PI);  // rango 0-1
                float sat = dist / radius;
                sf::Color col = HSVtoRGB(hue, sat, 1.0f);
                colorWheelImage.setPixel(x, y, col);
            }
        }
    }

    sf::Texture wheelTexture;
    wheelTexture.loadFromImage(colorWheelImage);
    sf::Sprite wheelSprite(wheelTexture);

    while (window.isOpen()) {
        sf::Event event;
        while (window.pollEvent(event)) {
            if (event.type == sf::Event::Closed)
                window.close();

            // Selección de color con clic
            if (event.type == sf::Event::MouseButtonPressed) {
                sf::Vector2i pos = sf::Mouse::getPosition(window);
                if (pos.x >= 0 && pos.x < windowSize && pos.y >= 0 && pos.y < windowSize) {
                    sf::Color selected = colorWheelImage.getPixel(pos.x, pos.y);
                    std::cout << "Color seleccionado: RGB(" 
                              << int(selected.r) << ", " 
                              << int(selected.g) << ", " 
                              << int(selected.b) << ")\n";
                }
            }
        }

        window.clear();
        window.draw(wheelSprite);
        window.display();
    }

    return 0;
}
